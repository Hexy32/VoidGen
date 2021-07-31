package de.xtkq.voidgen.generator.interfaces;

public abstract class ChunkGen3D extends ChunkGen implements IChunkGenBiomeGrid {

    @Override
    public void setBiomeGrid(BiomeGrid paramBiomeGrid, ChunkData paramChunkData) {
        for (int x = 0; x < 16; x++) {
            for (int z = 0; z < 16; z++) {
                for (int y = 0; y < paramChunkData.getMaxHeight(); y++) {
                    paramBiomeGrid.setBiome(x, y, z, this.chunkGenSettings.getBiome());
                }
            }
        }
    }
}
