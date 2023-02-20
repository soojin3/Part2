package edu.mit.quiz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller // 스프링 컨트롤러로 동작시키기 위한 어노테이션
@RequestMapping("/quiz1")
public class CountController {

		// 리다이렉트 처리시
		@RequestMapping("/quiz3")
		public String quiz3() {
			return "redirect:/quiz1/quiz4";
		}
		@RequestMapping("/quiz4") // url 매핑
		public void quiz4() {
			
		}

		// get이건 post건 모든 요청에 대응하는
		@RequestMapping("/result4") // url 매핑
		public String quiz22(String num1, Model model) {

			model.addAttribute("leng", num1.length());
			return "/result4";
		}

}
