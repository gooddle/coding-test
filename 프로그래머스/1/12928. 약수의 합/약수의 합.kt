class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        for(a in 1..n){
            if(n%a==0){
                answer += a
            }
        }
        return answer
    }
}