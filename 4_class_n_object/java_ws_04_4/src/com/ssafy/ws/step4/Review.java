package com.ssafy.ws.step4;

/**
 * 리뷰 정보를 나타내는 클래스
 */
public class Review {

	int reviewId;
	int resId;
	String writer;
	String content;
	
	public Review() {
		super();
	}

	public Review(int reviewId, int resId, String writer, String content) {
		super();
		this.reviewId = reviewId;
		this.resId = resId;
		this.writer = writer;
		this.content = content;
	}
	
	public String toString() {
		String reviewIdStr = Integer.toString(reviewId);
		String resIdStr = Integer.toString(resId);
		return "Restaurant [reviewID=" + reviewIdStr + ", resID=" + resIdStr +", writer= " + writer + ", content=" + content + "]";
	}

}
