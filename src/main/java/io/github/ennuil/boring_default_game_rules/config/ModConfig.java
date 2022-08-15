package io.github.ennuil.boring_default_game_rules.config;

import org.quiltmc.config.api.Config;
import org.quiltmc.config.api.WrappedConfig;
import org.quiltmc.config.api.annotations.Processor;
import org.quiltmc.config.api.values.ValueMap;

@Processor("setSerializer")
public class ModConfig extends WrappedConfig {
	// wait, how in the world is this working???
	public final String $schema = ModConfigManager.GENERATE_ME;
	public final ValueMap<String> default_game_rules = ValueMap.builder("").build();
	public final boolean generate_json_schema = true;

	// TODO - JSON support, with JSON5 being opt-in
	public void setSerializer(Config.Builder builder) {
		builder.format("json5");
	}
}
