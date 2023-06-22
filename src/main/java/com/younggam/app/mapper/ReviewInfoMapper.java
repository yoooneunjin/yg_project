package com.younggam.app.mapper;

import java.util.List;

import com.younggam.app.vo.ReviewInfoVO;

public interface ReviewInfoMapper {
	
	//전체 리뷰 조회
	List<ReviewInfoVO> selectReviewInfos(ReviewInfoVO reivews);
	
	//한 개의 리뷰 조회
	ReviewInfoVO selectReviewInfo(int riNum);
	
	//리뷰 작성
	int insertReviewInfo(ReviewInfoVO review);
	
	//내 리뷰 조회
	List<ReviewInfoVO> selectUserReviewInfos(String uiNickname);
}
