package ss19_String_and_Regex.Bai_tap.Validate_Account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static ss19_String_and_Regex.Thuc_hanh.Validate_Account.AccountExample.ACCOUNT_REGEX;

public class ClassNameExample {
    /*Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
	  Không chứa các ký tự đặc biệt
	  Theo sau ký tự bắt đầu là 4 ký tự số 
	  Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M
	*/
    private static final String CLASSNAME_REGEX = "^(C|A|P)[0-9]{4}(G|H|K|L|M)$";
    public ClassNameExample(){}
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
