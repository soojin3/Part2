package edu.mit.quiz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 스프링 컨트롤러로 동작시키기 위한 어노테이션
@RequestMapping("/quiz")
public class MitController {

	@RequestMapping("/quiz1") // url 매핑
	public void quiz1() {
		// !!중요!!(아무것도 없으면,) 요청이름.jsp를 열도록 한다. (즉,ex05.jsp요청)
		// 요청은 기본적으로 dispatch
		// jsp 파일 위피는 WEB_INF/views/
	}

	// get이건 post건 모든 요청에 대응하는
	@RequestMapping("/quiz2") // url 매핑
	public String quiz22() {
		return "/quiz2";
	}

	@RequestMapping("/quiz3") // url 매핑
	public String quiz33() {
		return "/quiz3";
	}

}
