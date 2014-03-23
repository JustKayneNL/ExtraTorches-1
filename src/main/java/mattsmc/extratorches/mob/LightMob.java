package mattsmc.extratorches.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class LightMob extends ModelBase
{
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leftleg;
    ModelRenderer rightleg;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
  
  public LightMob()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -1F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 32, 0);
      body.addBox(-4.5F, 0F, -2.5F, 9, 8, 5);
      body.setRotationPoint(0F, 7F, 0F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 8, 16);
      leftleg.addBox(-1F, 0F, -1F, 2, 8, 2);
      leftleg.setRotationPoint(3F, 15F, 0F);
      leftleg.setTextureSize(64, 32);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-1F, 0F, -1F, 2, 8, 2);
      rightleg.setRotationPoint(-3F, 15F, 0F);
      rightleg.setTextureSize(64, 32);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 24, 16);
      rightarm.addBox(-1.5F, -1F, -1F, 2, 9, 2);
      rightarm.setRotationPoint(-5F, 9F, 0F);
      rightarm.setTextureSize(64, 32);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 16, 16);
      leftarm.addBox(-0.5F, -1F, -1F, 2, 9, 2);
      leftarm.setRotationPoint(5F, 9F, 0F);
      leftarm.setTextureSize(64, 32);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
    setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    head.render(par7);
    body.render(par7);
    leftleg.render(par7);
    rightleg.render(par7);
    rightarm.render(par7);
    leftarm.render(par7);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
  {

	  //Head Movement//
	  this.head.rotateAngleY = par4 / (180F / (float)Math.PI);
	  this.head.rotateAngleX = par5 / (170F / (float)Math.PI);
	  //Head Movement End//
	  
	  //Rightarm Movement//
	  this.rightarm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float) Math.PI) * 2.0F * par2 * 0.5F;
	  this.rightarm.rotateAngleZ = 0.0F;
	  //Rightarm Movement End//
  
	  //Leftarm Movement//
	  this.leftarm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
	  this.leftarm.rotateAngleZ = 0.0F;
	  //Leftarm Movement//
	  
	  //Rightleg Movement//
	  this.rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	  this.rightleg.rotateAngleY = 0.0F;
	  //Rightleg Movement//
	  
	  //Leftleg Movement//
	  this.leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
	  //Leftleg Movement//
  }

}
