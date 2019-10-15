package interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    private static final String[] IGONORE_URI ={"/login"};

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("this is aftercompletion");
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("this is posthandle");
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("this is prehandle");
        boolean flag = false;
        String url = request.getServletPath();
        for (String s:IGONORE_URI) {
            if(url.contains(s)){
                flag = true;
                break;
            }
        }
        if(!flag){
            String name =(String) request.getSession().getAttribute("name");
            if(name==null){
                request.setAttribute("mesage","请先登录");
                request.getRequestDispatcher("/WEB-INF/views/loginform.jsp").forward(request,response);
            }else {
                flag=true;
            }
        }
        return flag;
    }
}
