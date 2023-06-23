package com.younggam.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.younggam.app.mapper.ReviewerInfoMapper;
import com.younggam.app.vo.UserInfoVO;

public class ReviewerInfoService {
	
	@Autowired
	private ReviewerInfoMapper riMapper;

	//검색 - 리뷰어 조회
	public List<UserInfoVO> selectReviewersInfo (String uiNickname) {
		return riMapper.selectReviewersInfos(uiNickname);
	}
}
