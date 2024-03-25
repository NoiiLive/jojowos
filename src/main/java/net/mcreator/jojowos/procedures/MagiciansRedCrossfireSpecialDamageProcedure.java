package net.mcreator.jojowos.procedures;

public class MagiciansRedCrossfireSpecialDamageProcedure {
	public static String execute() {
		return "\u00A76\u00A7lCrossfire Hurricane: Special: \u00A7f" + new java.text.DecimalFormat("##").format(Math.ceil(3 * Math.sqrt(1))) + " DMG";
	}
}
