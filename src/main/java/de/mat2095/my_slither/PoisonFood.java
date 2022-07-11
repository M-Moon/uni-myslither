package de.mat2095.my_slither;

public class PoisonFood extends Food
{
    final int x, y;
    private final double size;
    private final double rsp;
    private final long spawnTime;

    PoisonFood(int x, int y, double size, boolean fastSpawn) {
        super(x, y, size, fastSpawn);
    }
}
