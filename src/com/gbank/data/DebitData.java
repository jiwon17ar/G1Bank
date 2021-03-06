package com.gbank.data;

public class DebitData {

  public final String G1_BANK = "000"; /* G1 BANK 은행코드 */
  public final String SH_BANK = "001"; /* 신한은행 은행코드 */
  public final String KB_BANK = "002"; /* 국민은행 은행코드 */
  public final String HN_BANK = "003"; /* 하나은행 은행코드 */
  public final String CT_BANK = "004"; /* 시티은행 은행코드 */
  public final String KO_BANK = "005"; /* 카카오뱅크 은행코드 */
  public final String K_BANK = "006";  /* 케이뱅크 은행코드 */
  public final String KD_BANK = "007"; /* 기업은행 은행코드 */

  private int accountBalance;    // 계좌잔고
  private String debitNum;    // 계좌번호
  private String bankNo;      // 은행 고유번호
  private String debitName;    // 계좌 이름
  private String debitUserName;  // 계좌 이름
  private String debitPhone;    // 계좌소유자 폰번호 (유저 데이터와 이어지는 PK)
  private String debitStatus;  // 계좌의 현상태 (사용 : U, 정지 : S, 미사용 : X)

  public DebitData() {
	  
  }
  
  public String getDebitStatus() {
    return debitStatus;
  }

  public void setDebitStatus(String debitStatus) {
    this.debitStatus = debitStatus;
  }

  public String getDebitNum() {
    return debitNum;
  }

  public void setDebitNum(String debitNum) {
    this.debitNum = debitNum;
  }

  public int getAccountBalance() {
    return accountBalance;
  }

  public void setAccountBalance(int accountBalance) {
    this.accountBalance = accountBalance;
  }

  public String getDebitName() {
    return debitName;
  }

  public void setDebitName(String debitName) {
    this.debitName = debitName;
  }

  public String getDebitPhone() {
    return debitPhone;
  }

  public void setDebitPhone(String debitPhone) {
    this.debitPhone = debitPhone;
  }

  public String getBankNo() {
    return bankNo;
  }

  public void setBankNo(String bankNo) {
    this.bankNo = bankNo;
  }

  public String getDebitUserName() {
    return debitUserName;
  }

  public void setDebitUserName(String debitUserName) {
    this.debitUserName = debitUserName;
  }
}
