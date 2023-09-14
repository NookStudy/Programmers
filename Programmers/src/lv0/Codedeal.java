package lv0;

public class Codedeal {
	public String solution(String code) {
		int mode =0;
		String answer = "";
        for (int i = 0; i < code.length(); i++) {
			if(mode==0) {
				if (code.charAt(i)!='1') {
					if(i%2==0) {
						answer+=code.charAt(i);
					}
				}else if(code.charAt(i)=='1') {
					mode=1;
				}
			}else if(mode==1){
				if(code.charAt(i)!='1'){
					if (i%2==1) {
						answer+=code.charAt(i);
					}
				}else if(code.charAt(i)=='1') {
					mode=0;
				}
			}
		}
        if (answer=="") {
			return "EMPTY";
		}
        return answer;
    }
	
	

	public static void main(String[] args) {
		Codedeal codedeal = new Codedeal();
		System.out.println(codedeal.solution("abc1abc1abc"));

	}

}
