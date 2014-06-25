package com.dogspawteam.common.domain;

/**
 * 에러코드와 에러 메시지를 포함한 기본 Domain
 * @since 2014. 3. 27.
 * @author 김진형
 * @  수정일         수정자              수정내용
 * @ ---------    ---------   -------------------------------
 * @ 2014. 3. 27.           최초생성
 */
public class BaseDomain {
	protected int    errorCode;
	protected String errorMsg;
	
	
	public int getError_code() {
		return errorCode;
	}
	public void setError_code(int error_code) {
		this.errorCode = error_code;
	}
	public String getError_msg() {
		return errorMsg;
	}
	public void setError_msg(String error_msg) {
		this.errorMsg = error_msg;
	}
	
	
	@Override
	public String toString() {
		return "JboardVO [error_code=" + errorCode + ", error_msg="
				+ errorMsg + "]";
	}
}
