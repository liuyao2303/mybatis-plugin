package com.liuyao.test;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ccq.framework.annotation.ServiceTrace;
import com.ccq.framework.dao.GenercDao;

@Repository("dao")
//@ServiceTrace
public class Daotest extends GenercDao{

	public int insert(ForeumDmo dmo) {
		
		return super.insert(dmo);
	}
	
	
	public int update(ForeumDmo dmo) {
		
		return super.update(dmo);
	}
	
	public ForeumDmo selectOne(ForeumDmo dmo) {
		
		return super.selectOne(dmo);
	}
	
	public List<ForeumDmo> selectList(ForeumDmo dmo) {
		
		return super.selectList(dmo);
	}
	
	public Long selectCount(ForeumDmo dmo) {
		
		return super.selectCount(dmo);
	}
	
}

