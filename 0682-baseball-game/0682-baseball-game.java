class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                stack.pop();
            }else if(operations[i].equals("D")){
                int p = stack.peek();
                stack.push(p*2);
            }else if(operations[i].equals("+")){
                int a = stack.pop();
                int b = stack.pop();
                int res = a+b;
                stack.push(b);
                stack.push(a);
                stack.push(res);
            }else{
                int a = Integer.parseInt(operations[i]);
                stack.push(a);
            }
        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}