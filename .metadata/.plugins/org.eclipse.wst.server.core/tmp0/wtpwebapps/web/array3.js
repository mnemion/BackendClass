let data;	//변수가 같은 중복이름을 사용하지 않도록 하기 위한 선언
let array;

function calldata(data){
	console.log(data);
	 this.array = data;
}

function abc(){
	this.array["member_list"].sort(function (a, b){
		//console.log(a);
		//return a["point"] - b["point"]; //올림차순
		return b["point"] - a["point"]; //내림차순
	});
	
	//console.log(this.array);
	let html = document.getElementById("list");
	//for in => 배열 전용 반복문
	var s;
	for(s in this.array["member_list"]){
		html.innerHTML += "<ul>"
		var f;
		for(f in this.array["member_list"][s]){
			//console.log(f);
			//console.log(this.array["member_list"][s][f]);
			if(f == "point"){
				html.innerHTML += "<li>" + this.array["member_list"][s][f].toLocaleString()+"</li>"
			} else{
				html.innerHTML += "<li>" + this.array["member_list"][s][f]+"</li>"
			}
		}
		html.innerHTML += "</ul>"
	}	
	
}

/*function abc(){
	// 192.168.110.215
	function aaa(){
		if(window.XMLHttpRequest){
			return new XMLHttpRequest();
		}
	}
	function bbb(){
		if(data.readyState == XMLHttpRequest.DONE && data.status == 200){
			const array = JSON.parse(this.response);
			console.log(array);
		}
	}
	data = aaa();
	data.onreadystatechange = bbb;
	data.open("get", "http://192.168.110.215:8081/web/userlist.json", true);
	data.send();
}
*/