function b_write(){
	//글쓰기
	if(document.getElementById("utitle").value == ""){
		alert("제목을 입력해주세요.");
	}
	else if(document.getElementById("uname").value == ""){
		alert("글쓴이를 입력해주세요.");
	}
	else if(document.getElementById("upass").value == ""){
		alert("패스워드를 입력해주세요.");
	}
	else if(document.getElementById("texts").value == ""){
		alert("내용을 입력해주세요.");
	}
	else {
		f.submit();
	}
}