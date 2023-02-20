package edu.mit.last;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 스프링 컨트롤러로 동작시키기 위한 어노테이션
public class lengthController {

	@RequestMapping("/quiz1/quiz2/quiz3")
	public void quiz6() {

	}

	// 리다이렉트 처리시
	@RequestMapping("/quiz2/quiz3")
	public String quiz3(String name, String age, String add, String id, String pw, Model model) {
		int sum = name.length() + age.length() + add.length() + id.length() + pw.length();
		model.addAttribute("sum", sum);
		return "redirect:/quiz2/result";
	}

	@RequestMapping("/quiz2/result")
	public String quiz22(Model model, String sum) {
		model.addAttribute("sum", sum);
		return "/result";
	}

}
