package edu.c305.mit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.c305.mit.controller.vo.ProductVO;

@Controller // 스프링 컨트롤러로 동작시키기 위한 어노테이션
@RequestMapping("/go")
public class TestController {

	// get이건 post건 모든 요청에 대응하는
	@RequestMapping("/ex05") // url 매핑
	public void ex01() {
		// !!중요!!(아무것도 없으면,) 요청이름.jsp를 열도록 한다. (즉,ex05.jsp요청)
		// 요청은 기본적으로 dispatch
		// jsp 파일 위피는 WEB_INF/views/
	}

	@RequestMapping("test2")
	public String ex02() {// 일단 메서드 만들기
		return "/aaa/result"; // 문자열 리턴값이 요청할 page이 이름을 의미한다.
		// (즉, resilt.jsp)
	}

	// 리다이렉트 처리시
	@RequestMapping("test2re")
	public String ex03() {
		return "redirect:/go/ex05";
	}

	// 데이터를 jsp로 보낼때 Model 객체를 이용(기존방법 request.setAttrubute("name",value))
	@RequestMapping("test3")
	public String test3(Model model) {
		model.addAttribute("bbb",55);
		model.addAttribute(75);//보내는 데이터에 이름을 생략할 경우 해당하는 데이터 클래스의
								//이름으로 설정되어서 간다. (단, 첫글자를 소문자로 해서)
		ProductVO vo = new ProductVO("모니터", 100);
		model.addAttribute(vo);//productVO 이름으로 전달된다.
		return "productDetail";
	}
	//파라메터 자동수집 (form으로 보내온 데이터)
	@RequestMapping("ex01")
	public void exex01(ProductVO vo) {
		//vo 객체 만들어서 보내온 데이터로 다 세팅된다. 
	}
	
	

}
