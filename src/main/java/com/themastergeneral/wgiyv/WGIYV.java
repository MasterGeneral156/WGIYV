package com.themastergeneral.wgiyv;

import java.util.logging.Logger;

import com.themastergeneral.wgiyv.proxy.Common;

import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.MODID, name = ModInfo.MODNAME, certificateFingerprint = ModInfo.FingerPrint, version = ModInfo.VERSION, dependencies = ModInfo.DEPENDENCIES, updateJSON = ModInfo.updateJSON, acceptedMinecraftVersions = ModInfo.MCVersion)
public class WGIYV {
	@Instance
	public static WGIYV instance = new WGIYV();

	@SidedProxy(clientSide = "com.themastergeneral.wgiyv.proxy.Client", serverSide = "com.themastergeneral.wgiyv.proxy.Server")
	public static Common proxy;
	public static Logger logger;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
	
	@EventHandler
	public void onFingerprintViolation(FMLFingerprintViolationEvent e) {
		FMLLog.warning("Invalid fingerprint detected for WGIYV! TheMasterGeneral will not support this version!");
	}
}
