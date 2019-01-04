package com.TCard.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.TCard.demo.Model.Post;
import com.TCard.demo.service.PostService;

@Controller
@RequestMapping(value = "/post")
public class PostController {

	@Autowired
	private PostService postService;

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable int id, Authentication authentication, RedirectAttributes model) {
		Post post = postService.findOne(id);
		if (post == null || authentication == null || authentication.getName() == null
				|| !authentication.getName().equals(post.getUser().getUsername())) {
			return "redirect:/";
		}

		postService.delete(post);

		model.addFlashAttribute("message", "post was successfully deleted");
		return "redirect:/topic/" + post.getTopic().getId();
	}
}