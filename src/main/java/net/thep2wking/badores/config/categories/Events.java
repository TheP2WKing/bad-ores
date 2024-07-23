package net.thep2wking.badores.config.categories;

import net.minecraftforge.common.config.Config;

public class Events {
	@Config.Name("Polite Chat Messages")
    public boolean POLITE_CHAT_MESSAGES = true;

    @Config.Name("Wannafite Mining Damage")
    public boolean WANNAFITE_MINING_DAMAGE = true;

    @Config.Name("Breakium Breaks Tools")
    public boolean BREAKIUM_BREAKS_TOOLS = true;

    @Config.Name("Enderite Teleportation")
    public boolean ENDERITE_TELEPORTATION = true;

    @Config.Name("Website Opens Random Websites")
    public boolean WEBSITE_OPENS_RANDOM_WEBSITES = true;

    @Config.Name("Website Possible URLs")
    public String[] WEBSITE_POSSIBLE_URLS = new String[]{"https://www.google.com", "https://www.minecraft.net", "https://minecraft.wiki", "https://forums.minecraftforge.net", "https://www.minecraftforge.net", "https://www.curseforge.com", "https://www.youtube.com/watch?v=dQw4w9WgXcQ", "https://github.com/TheP2WKing/bad-ores", "https://github.com/diesieben07/Modjam-4"};

    @Config.Name("Misleadium Chat Messages")
    public boolean MISLEADIUM_CHAT_MESSAGES = true;

    @Config.Name("Ghostium Not Collectable")
    public boolean GHOSTIUM_NOT_COLLECTABLE = true;

    @Config.Name("Amadeum Sounds")
    public boolean AMADEUM_SOUNDS = true;

    @Config.Name("Unobtainium Not Harvestable")
    public boolean UNOBTAINIUM_NOT_HARVESTABLE = true;

    @Config.Name("Killium Can Kill Players")
    public boolean KILLIUM_CAN_KILL_PLAYERS = true;

    @Config.Name("Movium Movement")
    public boolean MOVIUM_MOVEMENT = true;

    @Config.Name("Balancium Drops Resources")
    public boolean BALANCIUM_DROPS_RESOURCES = true;

    @Config.Name("Explodeitmite Explosions")
    public boolean EXPLODEITMITE_EXPLOSIONS = true;

	@Config.Name("Explodeitmite Explosion Damage")
    public boolean EXPLODEITMITE_EXPLOSION_DAMAGE = true;

    @Config.Name("Shiftium No Raytracing")
    public boolean SHIFTIUM_NO_RAYTRACING = true;

    @Config.Name("Wantarite Spawns Pig")
    public boolean WANTARITE_SPAWNS_PIG = true;

    @Config.Name("Idlikeabite Decreases HUnger")
    public boolean IDLIKEABITE_DECREASES_HUNGER = true;

    @Config.Name("Meteorite Spawns Blocks")
    public boolean METEORITE_SPAWNS_BLOCKS = true;

    @Config.Name("Streetscum Can Delte Items")
    public boolean STREETSCUM_CAN_DELETE_ITEMS = true;

    @Config.Name("Fleesonsite Spawns Itself")
    public boolean FLEESONSITE_SPAWNS_ITSELF = true;

    @Config.Name("Fleesonsite Jumping")
    public boolean FLEESONSITE_JUMPING = true;

    @Config.Name("Nopium Item Dropping")
    public boolean NOPIUM_ITEM_DROPPING = true;

    @Config.Name("Zombieunite Requires Zombies")
    public boolean ZOMBIEUNITE_REQUIRES_ZOMBIES = true;

    @Config.Name("Paintitwhite")
    public boolean PAINTITWHITE = true;

    @Config.Name("Iwontfite Disables Damage")
    public boolean IWONTFITE_DISABLES_DAMAGE = true;

    @Config.Name("Tauntum Sounds")
    public boolean TAUNTUM_SOUNDS = true;

    @Config.Name("Pandaemonium Spawns Blocks")
    public boolean PANDAEMONIUM_SPAWNS_BLOCKS = true;

	@Config.Name("Pandaemonium Drops Resources")
    public boolean PANDAEMONIUM_DROPS_RESOURCES = true;

	@Config.Name("Pandaemonium Sounds")
    public boolean PANDAEMONIUM_SOUNDS = true;

    @Config.Name("Nosleeptonite Spawns Itself")
    public boolean NOSLEEPTONITE_SPAWNS_ITSELF = true;

	@Config.Name("Nosleeptonite Sounds")
    public boolean NOSLEEPTONITE_SOUNDS = true;

    @Config.Name("Appetite Restores Hunger")
    public boolean APPEITTE_RESTORES_HUNGER = true;

    @Config.Name("Crashium Can Crash Game")
    public boolean CRASHIUM_CAN_CRASH_GAME = true;

    @Config.Name("Smite Can Spawn Lightning Bolt")
    public boolean SMITE_CAN_SPAWN_LIGHTNING_BOLT = true;

    @Config.Name("Kakkarite Drops Shit")
    public boolean KAKKARITE_DROPS_SHIT = true;

	@Config.Name("Kakkarite Drop Count")
	@Config.RangeInt(min = 1, max = 100000)
	public int KAKKARITE_DROP_COUNT = 9001;
}
