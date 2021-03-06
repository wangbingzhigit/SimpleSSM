package cn.ssm.po;

import cn.ssm.controller.validation.ValidationGroup1;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class Items {
    private Integer id;

    //校验名称在1-30个字符中间,message提示的出错显示的信息
    //groups标示此校验属于哪个分组
    @Size(min = 1,max = 30,message = "{items.name.length.error}",groups = {ValidationGroup1.class})
    private String name;

    private Float price;

    private String pic;

    //生产日期非空校验
    @NotNull(message = "{items.create.isNULL}")
    private Date createtime;

    private String detail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", price=" + price
				+ ", pic=" + pic + ", createtime=" + createtime + ", detail="
				+ detail + "]";
	}
    
}