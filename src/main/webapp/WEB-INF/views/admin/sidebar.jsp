<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


  <!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">

    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">

      <!-- Sidebar user panel (optional) -->
      <div class="user-panel">
        <div class="pull-left image">
          <img src="/res/adminlte2/dist/img/avatar04.png" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p>${user.name}</p>
        </div>
      </div>

      <!-- search form (Optional) -->
      <form action="#" method="get" class="sidebar-form">
        <div class="input-group">
          <input type="text" name="q" class="form-control" placeholder="Search...">
          <span class="input-group-btn">
              <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
              </button>
            </span>
        </div>
      </form>
      <!-- /.search form -->

      <!-- Sidebar Menu -->
      <ul class="sidebar-menu" data-widget="tree">
        <li class="header">Management</li>
        <!-- Optionally, you can add icons to the links -->
        <li id="sidebarClient" class="active"><a href="#"><i class="fa fa-firefox"></i> <span>Client</span></a></li>
        <li id="sidebarUser"><a href="#"><i class="fa fa-users"></i> <span>User</span></a></li>
        <li class="header"><a href="/admin/logout"><i class="fa fa-circle-o text-red"></i> <span>Logout</span></a></li>
      </ul>
      <!-- /.sidebar-menu -->
    </section>
    <!-- /.sidebar -->
  </aside>