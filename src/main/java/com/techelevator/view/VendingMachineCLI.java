package com.techelevator.view;

import com.techelevator.util.Menu;
import com.techelevator.util.VendingMachine;

import java.io.IOException;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT };

	private static final String SUB_MENU_OPTION_FEED_MONEY = "Feed Money";
	private static final String SUB_MENU_OPTION_SELECT_PRODUCT = "Select Product";
	private static final String SUB_MENU_OPTION_FINISH_TRANSACTION = "Finish Transaction";
	private static final String[] SUB_MENU_OPTIONS = { SUB_MENU_OPTION_FEED_MONEY, SUB_MENU_OPTION_SELECT_PRODUCT, SUB_MENU_OPTION_FINISH_TRANSACTION };

	private final Menu menu;




	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}



	public void run(){

		VendingMachine vm = new VendingMachine();

		main:
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
			switch (choice) {
				case MAIN_MENU_OPTION_DISPLAY_ITEMS:
					vm.displayInventory();

					break;
				case MAIN_MENU_OPTION_PURCHASE:
					sub:
					while (true) {
						String choice2 = (String) menu.getChoiceFromOptions(SUB_MENU_OPTIONS);
						switch (choice2) {
							case SUB_MENU_OPTION_FEED_MONEY:
								vm.feedMoney();
								break;
							case SUB_MENU_OPTION_SELECT_PRODUCT:
								vm.buyProduct();
								break;
							case SUB_MENU_OPTION_FINISH_TRANSACTION:
								vm.dispenseChange();
								break sub;
						}
					}
					break;
				case MAIN_MENU_OPTION_EXIT:
					break main;
			}
		}
	}
	public static void main(String[] args){
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();

	}

}
