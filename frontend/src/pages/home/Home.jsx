import { Link } from "react-router-dom";
import "./Home.css";

function Home() {
    return (
        <div className="home">

            <h1>Home</h1>

                <div className="card-container">

                    <Link to="/hado" className="card">
                        <h2>🕷 Hado</h2>
                        <p>
                            Translate your normal text to Hado text.
                        </p>
                    </Link>

                    <Link to="/hador" className="card">
                        <h2>🔁 HadoR</h2>
                        <p>
                            Translate Hado text back to normal text.
                        </p>
                    </Link>

                    <Link to="/learn" className="card">
                        <h2>📚 Learn</h2>
                        <p>
                            Learn the Hado language step by step.
                        </p>
                    </Link>

                    <Link to="/info" className="card">
                        <h2>ℹ Info</h2>
                        <p>
                            Information about this project.
                        </p>
                    </Link>

            </div>

        </div>
    );
}

export default Home;