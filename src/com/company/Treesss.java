package com.company;

public class Treesss {
    public static void main(String[] args) {
        int pre[]={50,40,30,20,35,45,42,48,60,55,70};
        int in[]={20,30,35,40,42,45,48,50,55,60,70};

        //prepare bst using prefix and postfix

        KaroKaam ref=new KaroKaam();
        ref.createTrees(pre,0,10,in,0,10);
    }

}
class Nodess{
    Nodess left;
    Nodess right;
    int info;
    Nodess(int inf)
    {
        info=inf;
        left=null;
        right=null;
    }
}
class KaroKaam{
    Nodess createTrees(int[] pre,int ps,int pe,int[] in,int is,int ie){
        if(is>ie)
            return null;
        Nodess bangya=new Nodess(pre[ps]);
        System.out.println(pre[ps]);
        int i;
        for(i=0;i<in.length;i++)
        {
            if(in[i]==pre[ps])
                break;
        }
        int inls=is; int inle=i-1;
        int inrs=i+1; int inre=ie;

        int prels=ps+1; int prele=inle-inls+prels;
        int prers=prele+1; int prere=pe;

        bangya.left=createTrees(pre,prels,prele,in,inls,inle);
        bangya.right=createTrees(pre,prers,prere,in,inrs,inre);
        return bangya;
    }
}

