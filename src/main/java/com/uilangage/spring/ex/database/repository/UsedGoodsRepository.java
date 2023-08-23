package com.uilangage.spring.ex.database.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.uilangage.spring.ex.database.domain.UsedGoods;

// Mybatis 프레임워크 
//데이터 베이스 담당
//쿼리 수행
@Repository
public interface UsedGoodsRepository {
	
	//uesd_goods 테이블 모든행 조회
	public List<UsedGoods> selectUsedGoodsList();
	
	
	
	
}
