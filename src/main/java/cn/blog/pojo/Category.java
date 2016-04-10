package cn.blog.pojo;


public class Category {
        
        private Integer categoryId;     
        private String categoryName;    
        private Integer level;
        private Integer userId;
        public Category() {
                super();
        }
        public Category(Integer categoryId, String categoryName, Integer level,
                        Integer userId) {
                super();
                this.categoryId = categoryId;
                this.categoryName = categoryName;
                this.level = level;
                this.userId = userId;
        }
        public Integer getCategoryId() {
                return categoryId;
        }
        public void setCategoryId(Integer categoryId) {
                this.categoryId = categoryId;
        }
        public String getCategoryName() {
                return categoryName;
        }
        public void setCategoryName(String categoryName) {
                this.categoryName = categoryName;
        }
        public Integer getLevel() {
                return level;
        }
        public void setLevel(Integer level) {
                this.level = level;
        }
        public Integer getUserId() {
                return userId;
        }
        public void setUserId(Integer userId) {
                this.userId = userId;
        }
        
}