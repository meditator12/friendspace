$(document).ready(function(){
	$("#post").click(function(){
		var get= $("#textarea").val();
		var add= parseInt($("#totalCount").val()) + 1;
		$("#totalCount").val(add);
		var id_name = "div"+add;
		$("#wall-comments").prepend('<div style="width: 845px;float: left;margin-top: 5px;margin-left: 20px; height: 208px;" id="'+id_name+'"></div>');
		var image = "image"+add;
		$("#"+id_name).append('<div style="height: 208px; width: 20%; float: left;" id= "'+image+'"></div>');
		var write = "write"+add;
		$("#"+id_name).append('<div style="background-color: white; height: 208px; width: 80%; float: left;" id= "'+write+'"></div>');
		var pic = "pic"+add;
		$("#"+image).append('<img id="'+pic+'" src="http://desktop.freewallpaper4.me/view/original/5904/jesus-and-the-devil.jpg" width="170" height="130" />');
		var above = "above"+add;
		$('#'+write).append('<div style= "background-color: blue;height: 20px;width: 100%;float: left; align: left;"id= "'+above+'"></div>');
		$('#'+above).append('<div style= "background-color: #888888;height: 20px;width: 92%;float: left; align: left;">RItwik put it into the flame wall on 01-07-2014 at 07:08 pm</div>');
		var edit = "edit"+add;
		$('#'+above).append('<div style= "background-color: green;height: 100%;width: 4%;float: left;"id= "'+edit+'"></div>');
		var cross = "cross"+add;
		$('#'+above).append('<div style= "background-color: yellow;height: 100%;width: 4%;float: left;"id= "'+cross+'"></div>');
		var fire_pencil = "fire_pencil"+add;
		$('#'+edit).append('<img id="'+fire_pencil+'" src="http://image.shutterstock.com/display_pic_with_logo/597991/597991,1320387303,1/stock-photo-pencil-idea-fire-burn-isolated-on-black-88053079.jpg" width="30" height="20" />');
		var fire_cross = "fire_cross"+add;
		$('#'+cross).append('<img id="'+fire_cross+'" src="http://s.wallpaperhere.com/wallpapers/1920x1200/20120620/4fe16247be9e4.jpg" width="30" height="20" />');
		var posting_div= "posting_div"+add;
		$('#'+write).append('<div style= "background-color: white;width: 100%;float: left; "id= "'+posting_div+'">jshjds</div>');
		$('#'+posting_div).text(get);
		$('#textarea').val("");
		$("#"+cross).click(function(){
			$("#"+id_name).remove();
		}); 
	});
});
		


		