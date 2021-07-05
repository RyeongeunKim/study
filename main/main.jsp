<%@page import="com.goods.db.listDAO"%>
<%@page import="com.goods.db.GoodsDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.var.list.varlist"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zxx">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="Yoga Studio Template">
    <meta name="keywords" content="Yoga, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Violet | Template</title>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css?family=Amatic+SC:400,700&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:100,200,300,400,500,600,700,800,900&display=swap"
        rel="stylesheet">

    <!-- Css Styles -->
    <link rel="stylesheet" href="./css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="./css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="./css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="./css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="./css/magnific-popup.css" type="text/css">
    <link rel="stylesheet" href="./css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="./css/style.css" type="text/css">


	<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
	<script>
	
	   $(window).scroll(function() {
	      $("#banner").stop().animate({   "top" : ($(window).scrollTop() + 800) + "px"   }, 500);
	   });
	
	</script>
	
	<style type="text/css">
		#banner {   position: absolute;    width: 80px;    height: 80px;   left: 95%;   bottom: 500px; }
	</style>
    <style type="text/css">
button{
  background:#FF87D2;
  color:#fff;
  border:none;
  position:relative;
  height:34px;
  font-size:1em;
  padding:0 2em;
  cursor:pointer;
  transition:800ms ease all;
  outline:none;
}
button:hover{
  background:#fff;
  color:#FF87D2;
}
button:before,button:after{
  content:'';
  position:absolute;
  top:0;
  right:0;
  height:2px;
  width:0;
  background: #FF87D2;
  transition:400ms ease all;
}
button:after{
  right:inherit;
  top:inherit;
  left:0;
  bottom:0;
}
button:hover:before,button:hover:after{
  width:100%;
  transition:800ms ease all;
}

    </style>
</head>

<body>

    <!-- Page Preloder -->
    <div id="preloder">
        <div class="loader"></div>
    </div>
    
    
    <!-- header 시작 -->
 		<jsp:include page="../header/header.jsp" />
	<!-- header 끝 -->
  <%
//테스트 버전 업2!
  	listDAO gdao = new listDAO();
  
 	
   
    List bestgoodsList = gdao.getbestGoodsList();

    String goHead = "./GoodsList.cos";
    varlist var = new varlist();
    String http[][] = var.getHttp();
	String cat[][] = var.getCat();	
    String skin[][] = var.getSkin(); 
   
    int bestsize = bestgoodsList.size();
  %>
    <!-- Hero Slider Begin -->
    <section class="hero-slider">
        <div class="hero-items owl-carousel">
            <div class="single-slider-item set-bg" data-setbg="./img/cosmain.jpg">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12">
                            <h1>2021</h1>
                            <h2>BEST SKIN CARE.</h2>
                            <a href="./GoodsList.cos" class="primary-btn">See More</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="single-slider-item set-bg" data-setbg="./img/cosmain2.jpg">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12">
                            <h1>2021</h1>
                            <h2>BEST SKIN CARE.</h2>
                            <a href="./GoodsList.cos" class="primary-btn">See More</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="single-slider-item set-bg" data-setbg="./img/cosmain3.jpg">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12">
                            <h1>2021</h1>
                            <h2>BEST SKIN CARE.</h2>
                            <a href="./GoodsList.cos" class="primary-btn">See More</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Hero Slider End -->

    <!-- Features Section Begin -->
    <section class="features-section spad">
        <div class="features-ads">
            <div class="container">
                <div class="row">
                    <div class="col-lg-4">
                        <div class="single-features-ads first">
                            <img src="./img/icons/f-delivery.png" alt="">
                            <h4>JUST SKIN CARE</h4>
                            <p> 립스틱, 아이라인, 섀도우, 파운데이션 ... 넘쳐나는 화장품 속,<br>
                           		그리고 심지어 마스크까지! <br>
                           		내 피부는 숨을 쉴 시간이 없어요. <br>
                           		내 피부를 진정시켜줄, 스킨케어 제품들만 모아놓았어요.<br>
                           		오전 10시 이전 주문 시, 당일배송이랍니다! </p>
                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="single-features-ads second">
                            <img src="./img/icons/coin.png" alt="">
                            <h4>다양한 쿠폰과 알뜰살뜰 포인트</h4>
                            <p> 제품 구매 시 구매금액의 1%에 해당하는 금액을,<br>
                           		현금처럼 사용가능한 포인트로 적립해드려요.<br>
                            	또한, 회원들에게 상시 다양한 쿠폰을 지급하니<br>
                            	절대 놓치지 마세요! </p>
                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="single-features-ads">
                            <img src="./img/icons/chat.png" alt="">
                            <h4>24시간 1:1 실시간 채팅</h4>
                            <p> 저스트스킨에게 궁금한 점이 생기셨나요?<br>
                             	홈페이지 하단 챗봇을 통해 질문해주세요.<br>
                             	(주말, 공휴일 제외)
                             	</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Features Box -->
        <div class="features-box">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6">
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="single-box-item first-box">
                                    <img src="./img/f-box-1.jpg" alt="">
                                    <div class="box-text">
                                        <span class="trend-year">2019 Party</span>
                                        <h2>Jewelry</h2>
                                        <span class="trend-alert">Trend Allert</span>
                                        <a href="#" class="primary-btn">See More</a>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-12">
                                <div class="single-box-item second-box">
                                    <img src="./img/orange.jpg" alt="orange">
                                    <div class="box-text">
                                        <span class="trend-year">2021 Trend</span>
                                        <h2 style="color:yellow;">skincare</h2>
                                        <span class="trend-alert" style="color:dark-gray;">orange & lemon</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="single-box-item large-box">
                            <img src="./img/lemon1.jpg" alt="">
                            <div class="box-text">
                                <span class="trend-year" style="color:white;">2021 skincare</span>
                                <h2 style="color:yellow;">Collection</h2>
                                <div class="trend-alert" style="color:dark-gray;">Trend skincare</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Features Section End -->

    <!-- Best Skincare Begin -->
    <section class="bast-skincare spad">
        <div class="container">
            <div class="product-filter">
                <div class="row">
                    <div class="col-lg-12 text-center">
                        <div class="section-title">
                            <h2>Best Skincare</h2>
                        </div>
                        <ul class="product-controls">
                        	<li data-filter=".*">All</li>
                          <%
                            for(int i = 2 ; i<http.length;i++){
                            	
                            %>
                            <li data-filter=".<%=http[i][1] %>"><%=http[i][1] %></li>
                            <%} %>
                            
                        </ul>
                    </div>
                </div>
            </div>
            <div class="row" id="product-list">
                <%for(int i = 0 ; i<bestsize ;i++){ 
            	GoodsDTO dto = (GoodsDTO) bestgoodsList.get(i);
            	%>
                <div class="col-lg-3 col-sm-6 mix all <%=dto.getCosCategory() %> ">
                    <div class="single-product-item">
                        <figure>
                            <a href="./GoodsDetail.cos?cosNum=<%=dto.getCosNum()%>"><img src="./admingoods/upload/<%=dto.getCosImage()%>" alt=""></a>
                            <div class="p-status">new</div>
                        </figure>
                        <div class="product-text">
                            <h6><%=dto.getCosName()%></h6>
                            <p><%=dto.getCosPrice() %>원  </p>
                            <button onclick="location.href='http://localhost:8088/ShoppingMall/Goods_basketpro.cos?cosAmount=1&cosNum=<%=dto.getCosNum()%>'">장바구니 담기</button>	
                        </div>
                    </div>
                </div>
                <%} %>
            </div>
        </div>
    </section>
    <!-- best skincare End -->

    <!-- skincare Section Begin -->
    <section class="lookbok-section">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-4 offset-lg-1">
                    <div class="lookbok-left">
                        <div class="section-title">
                            <h2>2021 <br />#skincare</h2>
                        </div>
                        <p>민감하고 건조한 피부에 보습을 위한 스킨 케어 방법
							피부 관리를 통해 민감하고 건조한 피부를 개선하기 위해서는 
							올바른 스킨 케어를 수행하는 것이 중요합니다. 
							피부에 맞는 스킨 케어 화장품을 선택할 뿐만 아니라 
							올바르게 사용하는 것도 매우 중요합니다. 
							여기에서는 민감하고 건조한 피부에 적합한 스킨 케어 방법을 소개합니다.
							보습제가 적절한 역할을 하기 위해서는 올바르게 사용하고 
							적절한 양을 사용하는 것이 중요합니다. 
							사용되는 물의 양이 작으면 습기와 오일이 충분히 충분히 부족할 수 없습니다. 
							적절한 양의 다수 보습제를 사용함으로써 피부의 장벽 기능 없이 
							피부의 건조를 효과적으로 방지할 수 있습니다.</p>
                        <a href="./GoodsList.cos" class="primary-btn look-btn" style="background-color:#FF87D2;">See More</a>
                    </div>
                </div>
                <div class="col-lg-5 offset-lg-1">
                    <div class="lookbok-pic">
                        <img src="./img/lemon2.jpg" alt="">
                        <div class="pic-text">fashion</div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- skincare Section End -->

    <!-- Logo Section Begin -->
    <div class="logo-section spad">
        <div class="logo-items owl-carousel">
            <div class="logo-item">
                <img src="./img/logos/logo-1.png" alt="">
            </div>
            <div class="logo-item">
                <img src="./img/logos/logo-2.png" alt="">
            </div>
            <div class="logo-item">
                <img src="./img/logos/logo-3.png" alt="">
            </div>
            <div class="logo-item">
                <img src="./img/logos/logo-4.png" alt="">
            </div>
            <div class="logo-item">
                <img src="./img/logos/logo-5.png" alt="">
            </div>
        </div>
    </div>
    <!-- Logo Section End -->

    <!-- footer 시작 -->
   		<jsp:include page="../footer/footer.jsp" />
    <!-- footer 끝 -->
    

   
</body>
 <!-- Js Plugins -->
    <script src="./js/jquery-3.3.1.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
    <script src="./js/jquery.magnific-popup.min.js"></script>
    <script src="./js/jquery.slicknav.js"></script>
    <script src="./js/owl.carousel.min.js"></script>
    <script src="./js/jquery.nice-select.min.js"></script>
    <script src="./js/mixitup.min.js"></script>
    <script src="./js/main.js"></script>
    
    
   	<!-- 플로팅 배너 시작 -->
	<div id="banner" style=" position:block;">
		<a href="./Survey.me"><img alt="" src="./img/main/question.png"></a>
	</div>
	<!-- 플로팅 배너 끝 -->

    
    

    
</body>


</html>