int [] resultado=new int[nums.length];
            for(int i=0; i<nums.length; i++){
                for(int j=0; j<nums.length; j++){
                    if(nums[i]>nums[j] && nums[i]!=nums[j]){
                        resultado[i]++;
                    }
                }
            }
            return resultado;
