package com.kwpugh.veggie_way.util;

import net.minecraftforge.common.ForgeConfigSpec;

public class VeggieWayConfig 
{
	public static ForgeConfigSpec.IntValue crop_hunger;
	public static ForgeConfigSpec.DoubleValue crop_saturation;

	public static ForgeConfigSpec.IntValue cooked_carrot_hunger;
	public static ForgeConfigSpec.DoubleValue cooked_carrot_saturation;
	
	public static ForgeConfigSpec.IntValue cooked_beetroot_hunger;
	public static ForgeConfigSpec.DoubleValue cooked_beetroot_saturation;
	
	public static ForgeConfigSpec.IntValue fried_egg_hunger;
	public static ForgeConfigSpec.DoubleValue fried_egg_saturation;
	
	public static ForgeConfigSpec.IntValue chocolate_bar_hunger;
	public static ForgeConfigSpec.DoubleValue chocolate_bar_saturation;
	
	public static ForgeConfigSpec.IntValue melon_chunk_hunger;
	public static ForgeConfigSpec.DoubleValue melon_chunk_saturation;
	
	public static ForgeConfigSpec.IntValue cactus_chunk_hunger;
	public static ForgeConfigSpec.DoubleValue cactus_chunk_saturation;

	public static ForgeConfigSpec.IntValue pumpkin_chunk_hunger;
	public static ForgeConfigSpec.DoubleValue pumpkin_chunk_saturation;
	
	public static ForgeConfigSpec.IntValue apple_pie_hunger;
	public static ForgeConfigSpec.DoubleValue apple_pie_saturation;
	
	public static ForgeConfigSpec.IntValue melon_pie_hunger;
	public static ForgeConfigSpec.DoubleValue melon_pie_saturation;
	
	public static ForgeConfigSpec.IntValue berry_pie_hunger;
	public static ForgeConfigSpec.DoubleValue berry_pie_saturation;
	
	public static ForgeConfigSpec.IntValue pumpkin_soup_hunger;
	public static ForgeConfigSpec.DoubleValue pumpkin_soup_saturation;
	
	public static ForgeConfigSpec.IntValue cactus_soup_hunger;
	public static ForgeConfigSpec.DoubleValue cactus_soup_saturation;
	
	public static ForgeConfigSpec.IntValue melon_soup_hunger;
	public static ForgeConfigSpec.DoubleValue melon_soup_saturation;

	public static ForgeConfigSpec.IntValue carrot_soup_hunger;
	public static ForgeConfigSpec.DoubleValue carrot_soup_saturation;
	
	public static ForgeConfigSpec.IntValue super_petals_hunger;
	public static ForgeConfigSpec.DoubleValue super_petals_saturation;
	
	public static ForgeConfigSpec.IntValue energy_drink_hunger;
	public static ForgeConfigSpec.DoubleValue energy_drink_saturation;
	
	public static ForgeConfigSpec.IntValue shake_hunger;
	public static ForgeConfigSpec.DoubleValue shake_saturation;
	
	public static ForgeConfigSpec.IntValue smoothie_hunger;
	public static ForgeConfigSpec.DoubleValue smoothie_saturation;
	
	public static ForgeConfigSpec.IntValue energyBar_hunger;
	public static ForgeConfigSpec.DoubleValue energyBar_saturation;
	
	public static ForgeConfigSpec.IntValue superFoodBar_hunger;
	public static ForgeConfigSpec.DoubleValue superFoodBar_saturation;
	
	public static ForgeConfigSpec.Builder server_output;
	
	
	public static void init(ForgeConfigSpec.Builder server)
	{
		server_output = server.comment("Crop Hunger and Saturation Values").push("Crops");
			
			server_output = server.comment("Crops").push("CornSoybeanQuinoaLentil");
			crop_hunger = server
					.comment("Hunger value:")
					.defineInRange("crop_hunger", 4, 0, 30);
			crop_saturation = server
					.comment("Saturation value:")
					.defineInRange("crop_saturation", 0.2, 0.0, 10.0);
			server_output.pop();
		
		server_output.pop();
	
		
		
		server_output = server.comment("Cooked Carrot & Beetroot Hunger and Saturation Values").push("Cooked");
		
			server_output = server.comment("Cooked").push("Cooked Carrot & Beetroot");		
			cooked_carrot_hunger = server
					.comment("Hunger value:")
					.defineInRange("cooked_carrot_hunger", 4, 0, 30);
			cooked_carrot_saturation = server
					.comment("Saturation value:")
					.defineInRange("cooked_carrot_saturation", 0.8, 0.0, 10.0);
	
			cooked_beetroot_hunger = server
					.comment("Hunger value:")
					.defineInRange("cooked_beetroot_hunger", 2, 0, 30);
			cooked_beetroot_saturation = server
					.comment("Saturation value:")
					.defineInRange("cooked_beetroot_saturation", 0.8, 0.0, 10.0);
			server_output.pop();
		
	    server_output.pop();
	
	
	
		server_output = server.comment("Chunk Hunger and Saturation Values").push("Chunks");
		
			server_output = server.comment("Chunks").push("Melon Chunk");
			melon_chunk_hunger = server
					.comment("Hunger value:")
					.defineInRange("melon_chunk_hunger", 2, 0, 30);
			melon_chunk_saturation = server
					.comment("Saturation value:")
					.defineInRange("melon_chunk_saturation", 0.2, 0.0, 10.0);
			server_output.pop();
		
			server_output = server.comment("Chunks").push("Cactus Chunk");
			cactus_chunk_hunger = server
					.comment("Hunger value:")
					.defineInRange("cactus_chunk_hunger", 2, 0, 30);
			cactus_chunk_saturation = server
					.comment("Saturation value:")
					.defineInRange("cactus_chunk_saturation", 0.2, 0, 10);
			server_output.pop();
		
			server_output = server.comment("Chunks").push("Pumpkin Chunk");
			pumpkin_chunk_hunger = server
					.comment("Hunger value:")
					.defineInRange("pumpkin_chunk_hunger", 2, 0, 30);
			pumpkin_chunk_saturation = server
					.comment("Saturation value:")
					.defineInRange("pumpkin_chunk_saturation", 0.2, 0, 10);
			server_output.pop();
		
		server_output.pop();		

		
		server_output = server.comment("Pie Hunger and Saturation Values").push("Pie");
		
			server_output = server.comment("Pie").push("Apple Pie");
			apple_pie_hunger = server
					.comment("Hunger value:")
					.defineInRange("apple_pie_hunger", 7, 0, 30);
			apple_pie_saturation = server
					.comment("Saturation value:")
					.defineInRange("apple_pie_saturation", 0.2, 0, 10);
			server_output.pop();
		
		
			server_output = server.comment("Pie").push("Melon Pie");
			melon_pie_hunger = server
					.comment("Hunger value:")
					.defineInRange("melon_pie_hunger", 7, 0, 30);
			melon_pie_saturation = server
					.comment("Saturation value:")
					.defineInRange("melon_pie_saturation", 0.2, 0, 10);
			server_output.pop();
			
		
			server_output = server.comment("Pie").push("Berry Pie");
			berry_pie_hunger = server
					.comment("Hunger value:")
					.defineInRange("berry_pie_hunger", 7, 0, 30);
			berry_pie_saturation = server
					.comment("Saturation value:")
					.defineInRange("berry_pie_saturation", 0.2, 0, 10);		
			server_output.pop();
		
		server_output.pop();
		
	
		server_output = server.comment("Soup Hunger and Saturation Values").push("Soup");
		
			server_output = server.comment("Soup").push("Pumpkin Soup");
			pumpkin_soup_hunger = server
					.comment("Hunger value:")
					.defineInRange("pumpkin_soup_hunger", 6, 0, 30);
			pumpkin_soup_saturation = server
					.comment("Saturation value:")
					.defineInRange("pumpkin_soup_saturation", 0.2, 0, 10);
			server_output.pop();
	
			
			server_output = server.comment("Soup").push("Melon Soup");
			melon_soup_hunger = server
					.comment("Hunger value:")
					.defineInRange("melon_soup_hunger", 6, 0, 30);
			melon_soup_saturation = server
					.comment("Saturation value:")
					.defineInRange("melon_soup_saturation", 0.2, 0, 10);
			server_output.pop();
			
			
			server_output = server.comment("Soup").push("Cactus Soup");
			cactus_soup_hunger = server
					.comment("Hunger value:")
					.defineInRange("cactus_soup_hunger", 6, 0, 30);
			cactus_soup_saturation = server
					.comment("Saturation value:")
					.defineInRange("cactus_soup_saturation", 0.2, 0, 10);
			server_output.pop();
	
			
			server_output = server.comment("Soup").push("Carrot Soup");
			carrot_soup_hunger = server
					.comment("Hunger value:")
					.defineInRange("carrot_soup_hunger", 6, 0, 30);
			carrot_soup_saturation = server
					.comment("Saturation value:")
					.defineInRange("carrot_soup_saturation", 0.2, 0, 10);
			server_output.pop();
		
		server_output.pop();

		
		server_output = server.comment("Super Food Hunger and Saturation Values").push("Super Foods");

			server_output = server.comment("Super Foods").push("Super Petals");
			super_petals_hunger = server
					.comment("Hunger value:")
					.defineInRange("super_petals_hunger", 6, 0, 30);
			super_petals_saturation = server
					.comment("Saturation value:")
					.defineInRange("super_petals_saturation", 0.8, 0, 10);
			server_output.pop();
		
			
			server_output = server.comment("Super Foods").push("Energy Drink");
			energy_drink_hunger = server
					.comment("Hunger value:")
					.defineInRange("energy_drink_hunger", 9, 0, 30);
			energy_drink_saturation = server
					.comment("Saturation value:")
					.defineInRange("energy_drink_saturation", 0.2, 0, 10);
			server_output.pop();
		
		
			server_output = server.comment("Super Foods").push("Shake");
			shake_hunger = server
					.comment("Hunger value:")
					.defineInRange("shake_hunger", 10, 0, 30);
			shake_saturation = server
					.comment("Saturation value:")
					.defineInRange("shake_saturation", 0.3, 0, 10);
			server_output.pop();
		
		
			server_output = server.comment("Super Foods").push("Smoothie");
			smoothie_hunger = server
					.comment("Hunger value:")
					.defineInRange("smoothie_hunger", 10, 0, 30);
			smoothie_saturation = server
					.comment("Saturation value:")
					.defineInRange("smoothie_saturation", 0.3, 0, 10);
			server_output.pop();
		
		
			server_output = server.comment("Super Foods").push("Bar");
			energyBar_hunger = server
					.comment("Hunger value:")
					.defineInRange("energyBar_hunger", 13, 0, 30);
			energyBar_saturation = server
					.comment("Saturation value:")
					.defineInRange("energyBar_saturation", 0.4, 0, 10);	
			
			superFoodBar_hunger = server
					.comment("Hunger value:")
					.defineInRange("superFoodBar_hunger", 13, 0, 30);
			superFoodBar_saturation = server
					.comment("Saturation value:")
					.defineInRange("superFoodBar_saturation", 0.4, 0, 10);
			server_output.pop();
		
		
		server_output.pop();
		
		
	server_output = server.comment("Misc Hunger and Saturation Values").push("Misc");
		
		server_output = server.comment("Misc").push("Chocolate Bar");
		chocolate_bar_hunger = server
				.comment("Hunger value:")
				.defineInRange("chocolate_bar_hunger", 7, 0, 30);
		chocolate_bar_saturation = server
				.comment("Saturation value:")
				.defineInRange("chocolate_bar_saturation", 0.2, 0, 10);
		server_output.pop();

		server_output = server.comment("Misc").push("Fried Egg");
		fried_egg_hunger = server
				.comment("Hunger value:")
				.defineInRange("fried_egg_hunger", 7, 0, 30);
		fried_egg_saturation = server
				.comment("Saturation value:")
				.defineInRange("fried_egg_saturation", 0.2, 0, 10);
		server_output.pop();
		
	server_output.pop();
		
	}
}