package com.infrastructuresickos.cafetable;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CafeTable.MOD_ID)
public class CafeTable {
    public static final String MOD_ID = "cafetable";
    private static final Logger LOGGER = LogManager.getLogger();

    public CafeTable() {
        LOGGER.info("Cafe Table mod loaded.");
    }
}
