
package awslv2flower.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="review", url="${api.url.review}")
public interface ReviewService {

    @RequestMapping(method= RequestMethod.GET, path="/reviews")
    public void reviewRequest(@RequestBody Review review);

}