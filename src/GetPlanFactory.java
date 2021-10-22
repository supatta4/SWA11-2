class GetPlanFactory{  
      
   //use getPlan method to get object of type Plan   
       public Plan getPlan(String planType){  
            if(planType == null){  
             return null;  
            }  
          if(planType.equalsIgnoreCase("dp")) {  
                 return new DomesticPlan();  
               }   
           else if(planType.equalsIgnoreCase("cp")){  
                return new CommercialPlan();  
            }   
          else if(planType.equalsIgnoreCase("ip")) {  
                return new InstitutionalPlan();  
          }  
          else if(planType.equalsIgnoreCase("ep")) {  
              return new EducationPlan();  
        }  
      return null;  
   }  
}
