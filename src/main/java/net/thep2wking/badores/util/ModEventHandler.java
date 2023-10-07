package net.thep2wking.badores.util;

import java.util.Iterator;
import java.util.List;

import com.google.common.collect.Lists;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public enum ModEventHandler {
	INSTANCE;

	private final List<Task> tasks = Lists.newArrayList();
	private final List<Task> scheduledNow = Lists.newArrayList();

	public void schedule(Runnable task, int ticks) {
		tasks.add(new Task(task, ticks));
	}

	@SubscribeEvent
	public void onTick(TickEvent.ServerTickEvent event) {
		if (tasks.size() > 0) {
			List<Task> sn = scheduledNow;
			for (Iterator<Task> it = tasks.iterator(); it.hasNext();) {
				Task t = it.next();
				if (t.tick()) {
					sn.add(t);
					it.remove();
				}
			}
			for (Task t : sn) {
				t.r.run();
			}
			sn.clear();
		}
	}

	private class Task {
		final Runnable r;
		int remaining;

		private Task(Runnable r, int remaining) {
			this.r = r;
			this.remaining = remaining;
		}

		boolean tick() {
			return --remaining == 0;
		}
	}
}
