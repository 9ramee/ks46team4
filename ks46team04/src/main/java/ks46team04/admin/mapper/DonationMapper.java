package ks46team04.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks46team04.admin.dto.Donation;
import ks46team04.admin.dto.DonationPayDetail;
import ks46team04.admin.dto.DonationPayMethod;
import ks46team04.admin.dto.DonationSub;
import ks46team04.admin.dto.Goods;

@Mapper
public interface DonationMapper {
	
	/*정기기부 단가 조회*/
	public List<Donation> getDonation();
	
	/*정기기부 단가 등록*/
	public int addDonation(Donation donation);
	
	/* 특정 정기기부 단가 조회 */
 	public Donation getDonationInfoByCode(String donationCode);
 	
	/* 정기기부 단가 수정 */
	public int modifyDonation(Donation donation);
	
	/* 정기기부 단가 삭제 */
	public int removeDonation(Donation donation);
	
	/* 등록된 회원 결제수단 조회 */
	public List<DonationPayMethod> getDonationPayMethod();
	
	/* 등록된 회원 결제수단 등록 */
	public int addDonationPayMethod(DonationPayMethod donationPayMethod);
	
	/* 특정 등록된 회원 결제수단 조회 */
 	public DonationPayMethod getDonationPayMethodInfoByCode(String donationPayMethodCode);
 	
	/* 등록된 회원 결제수단 수정 */
	public int modifyDonationPayMethod(DonationPayMethod donationPayMethod);
	
	/* 등록된 회원 결제수단 삭제 */
	public int removeDonationPayMethod(DonationPayMethod donationPayMethod);
	
	/* 정기기부 구독 신청 조회 */
	public List<DonationSub> getDonationSub();
	
	/* 정기기부 구독 신청 등록 */
	public int addDonationSub(DonationSub donationSub);
	
	/* 특정 정기기부 구독 신청 조회 */
 	public DonationSub getDonationSubInfoByCode(String donationSubCode);
 	
	/* 정기기부 구독 신청 수정 */
	public int modifyDonationSub(DonationSub donationSub);
	
	/* 정기기부 구독 신청 삭제 */
	public int removeDonationSub(DonationSub donationSub);
	
	/* 정기기부 구독 결제 상세 조회 */
	public List<DonationPayDetail> getDonationPayDetail();
}
