<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style>
	header{
		height: 100px;
		background: rgba(125, 211, 242, 0.5);
		border-radius: 15px;
		padding: 10px;
		margin: 10px 0;
		text-align: center;
	}
	
	ul.nav{
		background: rgba(201, 201, 201, 0.5);
		padding: 10px;
		border-radius: 10px;
	}
	
	footer{
		text-align: center;
		border-top: 1px solid gray;
		padding: 10px;
	}
</style>
</head>
<body>
	<div class="container">
		<header>
			<h2>그리드 시스템을 이용한 레이아웃</h2>
		</header>
		<section>
			<div class="row">
				<div class="col-md-2">
					<ul class="nav">
						<li>menu1</li>
						<li>menu2</li>
						<li>menu3</li>
						<li>menu4</li>
					</ul>
				</div>
				<div class="col-md-10">
					안희정 충남지사의 성폭행 의혹이 파장을 낳고 있는 가운데 안 지사를 지지했던 트위터 지지자 그룹(팀스틸버드)가 안 지사와의 절연(絶緣)을 선언했다. 
					팀스틸버드는 5일 공식계정을 통해 "최근 문화예술계의 #미투 운동에서 대다수의 국민들이 동의했듯, 윤리가 결여된 예술가의 작품은 가치가 없다"면서 "마찬가지로 가해자의 정치철학은 더이상 우리에게 의미가 없다"고 말했다. 
					팀스틸버드는 "보편적 인권을 말하는 안희정을 지지했다. 민주주의의 절차와 시스템을 중시하는 그를 믿었다"면서 "그러나 이번 JTBC의 보도를 통해 그의 철학과 가치는 모두 허위임이 명백해졌다"고 비판했다. 
					이어 "피해자의 고통 앞에서 저희 지지자들이 받은 상처를 거론하는 것은 너무도 염치없는 일"이라며 "오히려 그간의 지지활동이 피해자에게 또다른 상처를 안기고 고립감을 느끼게 한 것은 아닐까. 두렵다"고 심경을 밝혔다. 
					그러면서 "팀스틸버드 운영진은 이번 사건에서 가해자가 아닌 피해자의 곁에 서겠다. 뒤늦으나 피해자에게 연대와 지지를 전하며 향후 2차 가해에 함께 대응할 것"이라고 강조했다.
					팀스틸버드는 이번 성명서를 마지막으로 정치활동을 종료할 방침이다.
				</div>
			</div>
		</section>
		<footer>
			여기는 푸터가 들어가는 곳입니다.
		</footer>
	
	</div>
</body>
</html>