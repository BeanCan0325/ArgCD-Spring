package kr.co.GitOps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
    @GetMapping("/")
    public String root() {
        return "버전 1.0 - cicd 테스트 입니다.";
    }
}
