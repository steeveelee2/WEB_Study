$('input:checkbox').click(function(){
    if($(this).parent().attr('id')=='row0'){
        var idx=$(this).index(); var color=$(this).val();
        $(this).prop('checked')&&
            $('td[id*="row"]').each(function(){
                $(this).removeClass().addClass(color).children().each(function(){
                    $(this).prop('checked',$(this).index()==idx?true:false);
                });
            });
        $(this).prop('checked')||$('#resetFrm').trigger('click');
    }else{
        $(this).prop('checked')&&
            $('#row0').removeClass().children().prop('checked',false);
            $(this).siblings().prop('checked',false).parent().removeClass();
            $(this).parent().addClass($(this).val());
        $(this).prop('checked')||$(this).parent().removeClass();
    }
});
$('#resetFrm').click(()=>{
    $('table *').parent().removeClass();
    $('input:checkbox').prop('checked',false);
});