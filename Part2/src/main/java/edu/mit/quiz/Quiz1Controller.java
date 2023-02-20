package edu.mit.quiz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 스프링 컨트롤러로 동작시키기 위한 어노테이션
@RequestMapping("/quiz1")
public class Quiz1Controller {

	@RequestMapping("/quiz1") // url 매핑
	public void quiz1() {
		// !!중요!!(아무것도 없으면,) 요청이름.jsp를 열도록 한다. (즉,ex05.jsp요청)
		// 요청은 기본적으로 dispatch
		// jsp 파일 위피는 WEB_INF/views/
	}
	
	// get이건 post건 모든 요청에 대응하는
	@RequestMapping("/result") // url 매핑
	public String quiz22(int num1,int num2, Model model) {
		int sum=0;
		for(int i=num1;i<=num2;i++) {
			sum+=i;
		}
		
		model.addAttribute("sum",sum);
		return "/result";
	}


}
