package com.biz.bank.exec;

import java.util.*;

import com.biz.bank.service.*;
import com.biz.bank.vo.*;

public class BankExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strFileName = "src/com/biz/bank/bankBalance.txt";
		BankService bs = new BankService(strFileName);
		bs.readFile();

		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("====================================");
			System.out.println("1.입금2.출금3.계좌조회0.종료");
			System.out.println("------------------------------------");
			System.out.print("업무선택 >>");

			String sMenu = scanner.nextLine();
			int intMenu = Integer.valueOf(sMenu);

			if (intMenu == 1) {
				bs.bankInput();
			} else if (intMenu == 2) {
				bs.bankOutput();
			} else if (intMenu == 3) {

			} else if (intMenu == 0) {
				break;
			}

			// BankVO vo = bs.findId();

		}
		System.out.println("Good Bye!!");
	}
}
