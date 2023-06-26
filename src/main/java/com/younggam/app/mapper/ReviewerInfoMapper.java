package com.younggam.app.mapper;

import java.util.List;

import com.younggam.app.vo.ReviewInfoVO;
import com.younggam.app.vo.UserInfoVO;

public interface ReviewerInfoMapper {

	//검색어가 포함된 유저 조회
	List<UserInfoVO> selectReviewersInfos(String uiNickname);
	
	//상세페이지 유저 목록
	List<ReviewInfoVO> selectDetailReviewersInfos(String riMovieId);
	
	//별점 출력
	ReviewInfoVO selectStarInfos(String riMovieId);
	
	//포인트 출력
	
	//최근 리뷰어 리스트
	List<ReviewInfoVO> selectNewReviewersInfos(ReviewInfoVO reviews);
	
	
}
