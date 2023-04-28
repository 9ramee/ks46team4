/**
 * 체크박스 전체 선택
 */
$('#allCheck').click(function () {
	$('.checks').prop('checked', $(this).prop('checked'));
});
$('.checks').click(function () {
	let length = $('.checks').length;
	let checkedLength = $('.checks:checked').length;
	if (length == checkedLength) {
		$('#allCheck').prop('checked', true);
	} else {
		$('#allCheck').prop('checked', false);
	}
});

/**
 * totalSearchBtn 전체검색 버튼
 */
$('#totalSearchBtn').click(function(){
	 location.reload();
});

/**
 * searchBtn 상세검색 버튼
 */
$('#searchBtn').click(function(){
	 location.reload();
});

/**
 * returnBtn 뒤로가기 버튼
 */
$('#returnBtn').click(function(){
	 history.go(-1);
});



/**
 * select box value 값 -> input value로 넣기
 */
function func(category) {
	const selectInput = document.querySelector('#goodsCategory');
	selectInput.value = category;
};

/**
 * 세션에서 id값 가져오기
 */

/**
 * form submitBtn 등록하기 버튼 클릭 시 공란 체크
 */
$(function(){
	function validationCheck(ele){
		let data = $(ele).val();
		let isValid = true;
		if(typeof data == 'undefined' || data == null || data == ''){
			let msg = $(ele).parents('tr').find('label').text();
			alert(`${msg} 필수 항목입니다.`)
			$(ele).focus();
			isValid = false;
		}
		return isValid;
	};
	$('#submitBtn').click(function(){
		const addGoodsForm = $('#addGoodsForm');
		const inputGroup = $('#addGoodsForm input');
		let isSubmit = true;
		inputGroup.each(function(idx, item){
		isSubmit = validationCheck(item);
			if(!isSubmit) {
				let msg = $(item).parents('tr').find('label').text();
				alert(msg + '입력해주세요.');
				$(item).focus();
				return false;
			}
		});
	if(isSubmit) addGoodsForm.submit();
	});
});
