package main;

import java.util.List;

import model.Join01;
import model.Join01DAO;

public class Join01SelectList {
	public static void main(String[] args) {
		System.out.println("예매번호, 예매자, 예매영화, 예매일자, 상영일자, 상영회차, 상영관, 예매좌석 조회");
		
		Join01DAO jdao = new Join01DAO();
		List<Join01> joinList = jdao.SelectDataList();
		
		if(joinList.size() == 0){
			
		}else{
			for(Join01 bean : joinList){
				System.out.println(bean.toString());
			}
		}
		
	}

}
