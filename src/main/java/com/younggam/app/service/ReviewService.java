package com.younggam.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.younggam.app.mapper.ReviewInfoMapper;
import com.younggam.app.vo.ReviewInfoVO;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewInfoMapper riMapper;
	
	public List<ReviewInfoVO> selectReviewInfos(ReviewInfoVO reivews){
		return riMapper.selectReviewInfos(reivews);
	}
	
	public boolean insertReviewInfo(ReviewInfoVO review) {
		int result = riMapper.insertReviewInfo(review);
		if(result == 1) {
			return true;
		}
		return false;
	}
	
	public ReviewInfoVO selectReviewInfo (int riNum) {
		return riMapper.selectReviewInfo(riNum);
	}
	
	
	//작성한 리뷰 조회하기
	public List<ReviewInfoVO> selectUserReviewInfos(String uiNickname){
		return riMapper.selectUserReviewInfos(uiNickname);
	}
}
