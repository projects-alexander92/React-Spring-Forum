import React from 'react';
import {Link} from "react-router-dom";
const styles={
    backgroundColor: '#C3E6CB'
};

const Greeting = () => {
    return (
        <div className={'container justify-content-center'}>
            <div className={'jumbotron mt-2'} style={styles}>
                <h1 className={'display-4'}>Welcome to the forum</h1>
                <hr className={'my-4'}/>
                <p>Click on the catalog and start browsing the <Link to={'/catalog'}>Catalog</Link><br/>
                    Feel free to <Link to={'/submit-link'}> submit your own Links</Link></p>
            </div>
        </div>
    )
};

export default Greeting;
