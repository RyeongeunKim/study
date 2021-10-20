import React, { Component } from 'react';
import { Breadcrumb, BreadcrumbItem } from 'reactstrap';

class R036_ReactstrapBreadcrumbs extends Component {
    render(){
        return (
            <div id="top">
                <Breadcrumb tag="nav" listTag="div">
                    {/* div id="top"으로 이동 */}
                    <BreadcrumbItem tag="a" href="#top">Go_top</BreadcrumbItem>
                    {/* div id="bottom"으로 이동 */}
                    <BreadcrumbItem tag="a" href="#bottom">Go_bottom</BreadcrumbItem>
                </Breadcrumb>
                <div id="bottom" style={{marginTop:"1000px"}}>
                    <span>bottom</span>
                </div>
            </div>
        )
    }
}

export default R036_ReactstrapBreadcrumbs;