package me.herobrinedobem.heventos;

import java.io.File;
import java.io.IOException;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class MainListeners implements Listener {

	@EventHandler
	private void onPlayerInteractEvent(final PlayerInteractEvent e) {
		if ((e.getPlayer().getItemInHand().getType() == Material.IRON_AXE) && e.getPlayer().getItemInHand().hasItemMeta() && e.getPlayer().getItemInHand().getItemMeta().hasDisplayName() && e.getPlayer().getItemInHand().getItemMeta().getDisplayName().contains("Evento Spleef")) {
			if (e.getPlayer().hasPermission("heventos.admin")) {
				if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
					final File fileEvento = new File(HEventos.getHEventos().getDataFolder().getAbsolutePath() + "/Eventos/spleef.yml");
					final YamlConfiguration configEvento = YamlConfiguration.loadConfiguration(fileEvento);
					configEvento.set("Localizacoes.Chao_1", e.getClickedBlock().getWorld().getName() + ";" + (int) e.getClickedBlock().getLocation().getX() + ";" + (int) e.getClickedBlock().getLocation().getY() + ";" + (int) e.getClickedBlock().getLocation().getZ());
					try {
						configEvento.save(new File(HEventos.getHEventos().getDataFolder() + File.separator + "Eventos" + File.separator + "spleef.yml"));
					} catch (final IOException e1) {
						e1.printStackTrace();
					}
					e.getPlayer().sendMessage("§4[Evento] §cLocalizacao 1 do chao do spleef setada!");
					e.setCancelled(true);
				} else if (e.getAction() == Action.LEFT_CLICK_BLOCK) {
					final File fileEvento = new File(HEventos.getHEventos().getDataFolder().getAbsolutePath() + "/Eventos/spleef.yml");
					final YamlConfiguration configEvento = YamlConfiguration.loadConfiguration(fileEvento);
					configEvento.set("Localizacoes.Chao_2", e.getClickedBlock().getWorld().getName() + ";" + (int) e.getClickedBlock().getLocation().getX() + ";" + (int) e.getClickedBlock().getLocation().getY() + ";" + (int) e.getClickedBlock().getLocation().getZ());
					try {
						configEvento.save(new File(HEventos.getHEventos().getDataFolder() + File.separator + "Eventos" + File.separator + "spleef.yml"));
					} catch (final IOException e1) {
						e1.printStackTrace();
					}
					e.getPlayer().sendMessage("§4[Evento] §cLocalizacao 2 do chao do spleef setada!");
					e.setCancelled(true);
				}
			}
		} else if ((e.getPlayer().getItemInHand().getType() == Material.IRON_AXE) && e.getPlayer().getItemInHand().hasItemMeta() && e.getPlayer().getItemInHand().getItemMeta().hasDisplayName() && e.getPlayer().getItemInHand().getItemMeta().getDisplayName().contains("Evento MinaMortal")) {
			if (e.getPlayer().hasPermission("heventos.admin")) {
				if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
					final File fileEvento = new File(HEventos.getHEventos().getDataFolder().getAbsolutePath() + "/Eventos/minamortal.yml");
					final YamlConfiguration configEvento = YamlConfiguration.loadConfiguration(fileEvento);
					configEvento.set("Localizacoes.Mina_1", e.getClickedBlock().getWorld().getName() + ";" + (int) e.getClickedBlock().getLocation().getX() + ";" + (int) e.getClickedBlock().getLocation().getY() + ";" + (int) e.getClickedBlock().getLocation().getZ());
					try {
						configEvento.save(new File(HEventos.getHEventos().getDataFolder() + File.separator + "Eventos" + File.separator + "minamortal.yml"));
					} catch (final IOException e1) {
						e1.printStackTrace();
					}
					e.getPlayer().sendMessage("§4[Evento] §cLocalizacao 1 da mina setada!");
					e.setCancelled(true);
				} else if (e.getAction() == Action.LEFT_CLICK_BLOCK) {
					final File fileEvento = new File(HEventos.getHEventos().getDataFolder().getAbsolutePath() + "/Eventos/minamortal.yml");
					final YamlConfiguration configEvento = YamlConfiguration.loadConfiguration(fileEvento);
					configEvento.set("Localizacoes.Mina_2", e.getClickedBlock().getWorld().getName() + ";" + (int) e.getClickedBlock().getLocation().getX() + ";" + (int) e.getClickedBlock().getLocation().getY() + ";" + (int) e.getClickedBlock().getLocation().getZ());
					try {
						configEvento.save(new File(HEventos.getHEventos().getDataFolder() + File.separator + "Eventos" + File.separator + "minamortal.yml"));
					} catch (final IOException e1) {
						e1.printStackTrace();
					}
					e.getPlayer().sendMessage("§4[Evento] §cLocalizacao 2 da mina setada!");
					e.setCancelled(true);
				}
			}
		} else if ((e.getPlayer().getItemInHand().getType() == Material.IRON_AXE) && e.getPlayer().getItemInHand().hasItemMeta() && e.getPlayer().getItemInHand().getItemMeta().hasDisplayName() && e.getPlayer().getItemInHand().getItemMeta().getDisplayName().contains("BowSpleef")) {
			if (e.getPlayer().hasPermission("heventos.admin")) {
				if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
					final File fileEvento = new File(HEventos.getHEventos().getDataFolder().getAbsolutePath() + "/Eventos/bowspleef.yml");
					final YamlConfiguration configEvento = YamlConfiguration.loadConfiguration(fileEvento);
					configEvento.set("Localizacoes.Chao_1", e.getClickedBlock().getWorld().getName() + ";" + (int) e.getClickedBlock().getLocation().getX() + ";" + (int) e.getClickedBlock().getLocation().getY() + ";" + (int) e.getClickedBlock().getLocation().getZ());
					try {
						configEvento.save(new File(HEventos.getHEventos().getDataFolder() + File.separator + "Eventos" + File.separator + "bowspleef.yml"));
					} catch (final IOException e1) {
						e1.printStackTrace();
					}
					e.getPlayer().sendMessage("§4[Evento] §cLocalizacao 1 do bowspleef setada!");
					e.setCancelled(true);
				} else if (e.getAction() == Action.LEFT_CLICK_BLOCK) {
					final File fileEvento = new File(HEventos.getHEventos().getDataFolder().getAbsolutePath() + "/Eventos/bowspleef.yml");
					final YamlConfiguration configEvento = YamlConfiguration.loadConfiguration(fileEvento);
					configEvento.set("Localizacoes.Chao_2", e.getClickedBlock().getWorld().getName() + ";" + (int) e.getClickedBlock().getLocation().getX() + ";" + (int) e.getClickedBlock().getLocation().getY() + ";" + (int) e.getClickedBlock().getLocation().getZ());
					try {
						configEvento.save(new File(HEventos.getHEventos().getDataFolder() + File.separator + "Eventos" + File.separator + "bowspleef.yml"));
					} catch (final IOException e1) {
						e1.printStackTrace();
					}
					e.getPlayer().sendMessage("§4[Evento] §cLocalizacao 2 do bowspleef setada!");
					e.setCancelled(true);
				}
			}
		}
	}

	@EventHandler
	public void onSignChangeEvent(final SignChangeEvent e) {
		if (e.getPlayer().hasPermission("heventos.admin")) {
			if (e.getLine(0).equalsIgnoreCase("[Evento]")) {
				e.setLine(0, "§9[Evento]");
				e.setLine(1, "§61 Lugar");
				e.setLine(2, "§62 Lugar");
				e.setLine(3, "§63 Lugar");
				e.getPlayer().sendMessage("§4[Evento] §cPlaca criada com sucesso!");
			}
		}
	}

}
