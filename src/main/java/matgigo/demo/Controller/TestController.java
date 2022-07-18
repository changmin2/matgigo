package matgigo.demo.Controller;

import lombok.RequiredArgsConstructor;
import matgigo.demo.Service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping
    @ResponseBody
    public void Test(){
        testService.Test("changmin",17);
    }
}
