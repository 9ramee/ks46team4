package ks46team04.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks46team04.admin.dto.Funding;
import ks46team04.admin.dto.FundingPay;
import ks46team04.admin.dto.FundingRefund;


@Mapper
public interface FundingMapper {
	// 펀딩 정보 수정
	public int modifyFunding(Funding funding);
	// 특정 펀딩 조회
	public Funding getFundingInfoByCode(String fundingCode);
	// 펀딩 정보 조회
	public List<Funding> getFundingList();
	// 펀딩 결제내역 조회
	public List<FundingPay> getFundingPayList();
	// 펀딩 환불신청내역 조회
	public List<FundingRefund> getRefundList();
}
